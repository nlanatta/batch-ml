package com.ml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ml.task.AlignDataCreator;
import com.ml.task.AlignStarsWithSunDataCreator;
import com.ml.task.MaxTriangleDataCreator;
import com.ml.task.TriangleDataCreator;

@Component
public class Executor {

	@Autowired
	@Qualifier("alignDataCreator")
	AlignDataCreator alignDataCreator;

	@Autowired
	@Qualifier("alignStarsWithSunDataCreator")
	AlignStarsWithSunDataCreator alignWithSunDataCreator;

	@Autowired
	TriangleDataCreator triangleDataCreator;

	@Autowired
	MaxTriangleDataCreator triangleMaxDataCreator;
	
	public Executor()
	{
		executeTasks();
	}
	
	private void executeTasks() {
		alignDataCreator.run();
		System.out.println("ALIGN FINISHED");

		alignWithSunDataCreator.run();
		System.out.println("ALIGN WITH SUN FINISHED");

		triangleDataCreator.run();
		System.out.println("TRIANGLE FINISHED");

		triangleMaxDataCreator.run();
		System.out.println("MAX TRIANGLE FINISHED");
	}
}
