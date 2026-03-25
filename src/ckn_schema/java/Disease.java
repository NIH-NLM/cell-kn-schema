package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A disease is a disposition to undergo pathological processes that exists in an organism because of one or more disorders in that organism.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Disease {

  private String label;
  private String definition;
  private String exactSynonym;
  private String relatedSynonym;
  private String ontologyPurl;
  private String databaseCrossReference;

}