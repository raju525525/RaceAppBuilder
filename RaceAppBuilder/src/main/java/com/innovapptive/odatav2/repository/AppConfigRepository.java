package com.innovapptive.odatav2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.innovapptive.odatav2.entities.AppConfig;

public interface AppConfigRepository extends CrudRepository<AppConfig, String> {
	List<AppConfig> findByAppname(String appname);
}
