package None;

import java.util.List;
import lombok.*;






/**
  A dependent entity that inheres in a bearer by virtue of how the bearer is related to other entities.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class OrganismTrait  {

  private String label;
  private String ontologyPurl;
  private String definition;

}