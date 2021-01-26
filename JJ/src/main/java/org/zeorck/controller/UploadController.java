package org.zeorck.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.zeorck.DTO.BoardAttachDTO;

@Controller
@RequestMapping(value = "/upload",method = RequestMethod.GET)
public class UploadController {
	private static final Logger logger = LoggerFactory.getLogger(UploadController.class);

		@GetMapping("/uploadForm")
		public String getUploadform() {
			return "/board/uploadForm";
		}
	
		private String getFolder() {
			//현재날짜에 형식을 지정함
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		//	현재 날짜
			Date date=new Date();
			
		String str=sdf.format(date);
			
	return 	str.replace("-", File.separator);
		
			
		}
		
		@PostMapping("/uploadFormAction")
		@ResponseBody
		public ResponseEntity<ArrayList<BoardAttachDTO>> postUpload(MultipartFile[] uploadFile) {
			//어떤 폴더에 실제로 업로드를 할것인지에 대한 폴더경로
			System.out.println("uploadFormAction");
			ArrayList<BoardAttachDTO> list=new ArrayList<>();
		//	String uploadFolder="D:\\upload";
			String uploadFolder="C:\\upload";
			String uploadFolderPath=getFolder();			
			
			
			File uploadPath=new File(uploadFolder,uploadFolderPath);
			
			if(uploadPath.exists()==false) {
					uploadPath.mkdirs();
				}
			System.out.println("file="+uploadFile.length);
			
			for(MultipartFile files: uploadFile) {
				logger.info("사용자가 선택한 파일명:"+files.getOriginalFilename());
				logger.info("사용자가 선택한 파일크기:"+files.getSize());
				
				BoardAttachDTO attach=new BoardAttachDTO();
				String uploadFileName=files.getOriginalFilename();
				attach.setFileName(uploadFileName);
				UUID uuid=UUID.randomUUID();
				logger.info("uuid="+uuid);
				uploadFileName=uuid.toString()+"_"+files.getOriginalFilename();
				try {
					File saveFile=new File(uploadPath,uploadFileName);
					files.transferTo(saveFile);
					logger.info("savaFile="+saveFile);
					attach.setUploadPath(uploadFolderPath);
					attach.setUuid(uuid.toString());
					list.add(attach);
					logger.info("list="+list);
				}catch (Exception e) {
					e.getMessage();
				}
			}return new ResponseEntity<>(list,HttpStatus.OK);
		}
		
		@GetMapping("/display")
		@ResponseBody
		public ResponseEntity<byte[]> getFiles(String fileName){
			File file=new File("C:\\upload\\"+fileName);
			ResponseEntity<byte[]> result=null;
			try {
				HttpHeaders header=new HttpHeaders();
				header.add("Content-Type",Files.probeContentType(file.toPath()));
				result=new ResponseEntity<>(FileCopyUtils.copyToByteArray(file),
							header,HttpStatus.OK);
			}catch (IOException e) {
				e.printStackTrace();
			}
			return result;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
}
