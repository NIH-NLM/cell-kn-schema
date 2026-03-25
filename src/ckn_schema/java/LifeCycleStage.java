package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A spatiotemporal region encompassing some part of the life cycle of an organism.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class LifeCycleStage {

  private String label;
  private String ontologyPurl;
  private String definition;

}