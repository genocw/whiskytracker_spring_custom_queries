package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canFindAllWhiskiesForYear2018() {
		List<Whisky> results = whiskyRepository.findAllWhiskiesForYear(2018);
	}

	@Test
	public void canFindAllDistilleriesFromRegionSpeyside() {
		List<Distillery> results = distilleryRepository.findAllDistilleriesFromRegion("Speyside");
	}

	@Test
	public void canFindAllWhiskiesFromGlendronachDistilleryOfAge15() {
		List<Whisky> results = whiskyRepository.findAllWhiskiesFromDistilleryOFAge("Glendronach", 15);
	}

	@Test
	public void	canFindAllDistilleriesWithWhiskiesOfAge12() {
		List<Distillery> results = distilleryRepository.findAllDistilleriesWithWhiskiesOfAge(12);
	}

}
