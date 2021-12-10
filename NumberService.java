package com.example.demolta;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NumberService {
  public NumberRepsonse getSum(NumberRequest request) {
    int sum = 1;
    for (List<Integer> list : request.getData()) {
      for (int one : list) {
        sum *= one;
      }
    }
    Integer reduce = request.getData().stream()
        .flatMap(integers -> integers.stream())
        .reduce(1, (a, b) -> a * b);
    return new NumberRepsonse(reduce);
  }
}
