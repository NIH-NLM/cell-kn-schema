package None;

import java.util.List;
import lombok.*;






/**
  A material entity of anatomical origin (part of or deriving from an organism) that has as its parts a maximally connected cell compartment surrounded by a plasma membrane.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CellType  {

  private String label;
  private String definition;
  private String exactSynonym;
  private String relatedSynonym;
  private String databaseCrossReference;
  private String ontologyPurl;
  private String biologicalProcess;

}