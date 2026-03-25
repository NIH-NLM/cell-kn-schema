package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A location, relative to cellular compartments and structures, occupied by a macromolecular machine. There are three types of cellular components described in the gene ontology: (1) the cellular anatomical entity where a gene product carries out a molecular function (e.g., plasma membrane, cytoskeleton) or membrane-enclosed compartments (e.g., mitochondrion); (2)virion components, where viral proteins act, and (3) the stable macromolecular complexes of which gene product are parts (e.g., the clathrin complex).
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CellularComponent {

  private String ontologyPurl;
  private String label;
  private String definition;

}