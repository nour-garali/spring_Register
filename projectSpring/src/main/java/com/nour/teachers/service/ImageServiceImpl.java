package com.nour.teachers.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.nour.teachers.entities.Image;
import com.nour.teachers.repos.ImageRepository;

@Service
public class ImageServiceImpl implements ImageService {
	@Override
	public Image uplaodImageVet(MultipartFile file, Long idvet) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Image> getImagesParVet(Long vetId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Autowired
	ImageRepository imageRepository;
	@Autowired
	EnseignantService enseignantService;

	@Override
	public Image uplaodImage(MultipartFile file) throws IOException {
		/*
		 * Ce code commenté est équivalent au code utilisant le design pattern Builder
		 * Image image = new Image(null, file.getOriginalFilename(),
		 * file.getContentType(), file.getBytes(), null); return
		 * imageRepository.save(image);
		 */
		Image image = new Image("",file.getOriginalFilename(),file.getContentType(),file.getBytes());
		return imageRepository.save(Image.builder().name(file.getOriginalFilename()).type(file.getContentType())
				.image(file.getBytes()).build());
	}

	@Override
	public Image getImageDetails(Long id) throws IOException {
		final Optional<Image> dbImage = imageRepository.findById(id);
		return Image.builder().idImage(dbImage.get().getIdImage()).name(dbImage.get().getName())
				.type(dbImage.get().getType()).image(dbImage.get().getImage()).build();
	}

	@Override
	public ResponseEntity<byte[]> getImage(Long id) throws IOException {
		final Optional<Image> dbImage = imageRepository.findById(id);
		System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++++");
		return ResponseEntity.ok().contentType(MediaType.valueOf(dbImage.get().getType()))
				.body(dbImage.get().getImage());
	}

	@Override
	public void deleteImage(Long id) {
		imageRepository.deleteById(id);
	}
}
