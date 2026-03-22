package None;

import java.util.List;
import lombok.*;






/**
  A biological process is the execution of a genetically-encoded biological module or program. It consists of all the steps required to achieve the specific biological objective of the module. A biological process is accomplished by a particular set of molecular functions carried out by specific gene products (or macromolecular complexes), often in a highly regulated manner and in a particular temporal sequence.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class BiologicalProcess  {

  private String ontologyPurl;
  private String label;
  private String definition;

}