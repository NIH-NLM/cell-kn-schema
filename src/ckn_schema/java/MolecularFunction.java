package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A molecular process that can be carried out by the action of a single macromolecular machine, usually via direct physical interactions with other molecular entities. Function in this sense denotes an action, or activity, that a gene product (or a complex) performs.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class MolecularFunction {

  private String ontologyPurl;
  private String label;
  private String definition;

}