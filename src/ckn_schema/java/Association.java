package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A typed association between two entities, linked by a predicate.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Association<S, P, O> {

  private S subject;
  private P predicate;
  private O object;

}