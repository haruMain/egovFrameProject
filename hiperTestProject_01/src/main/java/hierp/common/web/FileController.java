package hierp.common.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ibm.icu.text.SimpleDateFormat;

import hierp.common.domain.vo.FileVO;
import net.coobird.thumbnailator.Thumbnailator;

@Controller("FileController")
public class FileController {
	Logger logger = Logger.getLogger(Log4jTest.class.getName());
	
//	public List<FileVO> upload(List<MultipartFile> upload) throws IOException {
//		
//		String rootPath = "C:/upload";
//		String uploadPath = getUploadPath();
//		List<FileVO> files = new ArrayList<>();
//		return null;
//		
//		
//	}
	
	
	
//	public String saveFile(MultipartFile multipartFile, String path) throws Exception{
//		String fileName = UUID.randomUUID().toString();
//		
//		StringBuffer buffer = new StringBuffer();
//		buffer.append(fileName);
//		buffer.append("_");
//		buffer.append(multipartFile.getOriginalFilename());
//		
//		File file = new File(path, buffer.toString());
//		multipartFile.transferTo(file);
//		
//        // fileName 리턴
//		return buffer.toString();
//	}

//	@PostMapping(value="/fileUpload.do", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
//	@ResponseBody    //컨트롤러 안에서 REST를 쓸 떄 어노테이션
//	public ResponseEntity<List<FileVO>> upload(MultipartFile[] multipartFiles) {
//		List<FileVO> files=new ArrayList<FileVO>();
//		String uplodaDirectory = "C://upload";
//		String uploadDatePath = getDirectoryForm();
//		
//		File uploadPath = new File(uplodaDirectory, uploadDatePath);
//		
//		if(!uploadPath.exists()) {
//			uploadPath.mkdirs();
//		}
//		for(MultipartFile multipartFile : multipartFiles ) {
//			logger.info("Upload File Name: " + multipartFile.getOriginalFilename());
//			logger.info("Upload File Size: " + multipartFile.getSize());
//			
//			FileVO fileVO = new FileVO();
//			String originalFileName = multipartFile.getOriginalFilename();
//			String fileName = null;
//			
//			
//			UUID uuid = UUID.randomUUID();
//			fileName = uuid.toString() + "_" + originalFileName;
//			
//			fileVO.setFileUuid(uuid.toString());
//			fileVO.setFileName(originalFileName);
//			fileVO.setFileUploadPath(uploadDatePath);
//			
//			try {
//				File file  = new File(uploadPath, fileName);
////				해당 경로에 파일 업로드
//				multipartFile.transferTo(file);
//				
//				InputStream in = new FileInputStream(file);
//				
////				썸네일 작업
////				업로드된 파일이 이미지 일때 실행
//				if(checkImageType(file)) {
//					fileVO.setFileImageCheck(true);
//					FileOutputStream out = new FileOutputStream(new File(uploadPath,"t_" + fileName));
//					Thumbnailator.createThumbnail(in, out, 100, 100);
//					in.close();
//					out.close();
//				}
//				
//				files.add(fileVO);
//				
//			} catch (IllegalStateException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		return new ResponseEntity<List<FileVO>>(files,HttpStatus.OK);
//	}
	
//	private String getDirectoryForm() {
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy//MM//dd");
//		Date today = new Date();
//		return simpleDateFormat.format(today);
//		
//	}
////	이미지 인지 확인
//	private boolean checkImageType(File file) throws IOException {
//		String contentType = Files.probeContentType(file.toPath());
//		return contentType.startsWith("image");
//		
//	}


	
}
