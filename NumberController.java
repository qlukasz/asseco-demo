import com.example.demolta.NumberRepsonse;
import com.example.demolta.NumberRequest;
import com.example.demolta.NumberService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class NumberController {

  private final NumberService numberService;

  @PostMapping("/getSum")
  @ResponseBody
  public NumberRepsonse getSum(@RequestBody NumberRequest data) {
    return numberService.getSum(data);
  }

}
