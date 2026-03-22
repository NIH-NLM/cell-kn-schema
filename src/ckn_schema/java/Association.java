package None;

import java.util.List;
import lombok.*;






/**
  A typed association between two entities, linked by a predicate.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Association  {

  private String subject;
  private String predicate;
  private String object;

}