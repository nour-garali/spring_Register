package com.nour.teachers.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nour.teachers.entities.Image;
public interface ImageRepository extends JpaRepository<Image , Long> {
}