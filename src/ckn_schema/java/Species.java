package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  The taxonomical classification of an organism.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Species {

  private String ontologyPurl;
  private String label;
  private String databaseCrossReference;

}