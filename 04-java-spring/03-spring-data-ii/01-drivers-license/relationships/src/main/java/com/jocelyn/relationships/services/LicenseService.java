package com.jocelyn.relationships.services;

import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jocelyn.relationships.models.License;
import com.jocelyn.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	private final LicenseRepository licenseRepo;
	
	public LicenseService(LicenseRepository licenseRepo) {
		this.licenseRepo = licenseRepo;
	}
	
	public List<License> allLicenses(){
		return licenseRepo.findAll();
	}
	
	public License createLicense(License license) {
		return licenseRepo.save(license);
	}
	
	public License findLicense(Long id) {
		Optional<License> optionalLicense = licenseRepo.findById(id);
		if(optionalLicense.isPresent()) {
			return optionalLicense.get();
		} else {
			return null;
		}
	}
	
	public License updateLicense(License license) {
		return licenseRepo.save(license);
	}
	
	public void deleteLicense(Long id) {
		licenseRepo.deleteById(id);
	}
}
