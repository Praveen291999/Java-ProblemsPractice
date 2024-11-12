package practice;

import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class RandomNumberGeneration {

	public static void main(String[] args) throws Exception {
		List<Integer> integers = IntStream.generate(() -> new Random().nextInt(1000)).limit(10).boxed().toList();
		System.out.println(integers);
		
		List<Double> doubles=DoubleStream.generate(()->new Random().nextDouble(10.0)).limit(10).boxed().toList();
		System.out.println(doubles);
	}
}
