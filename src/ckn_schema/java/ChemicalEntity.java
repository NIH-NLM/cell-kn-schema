package None;

import java.util.List;
import lombok.*;






/**
  A chemical entity is a physical entity of interest in chemistry including molecular entities, parts thereof, and chemical substances.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ChemicalEntity  {

  private String label;
  private String ontologyPurl;

}