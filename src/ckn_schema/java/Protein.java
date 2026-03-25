package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  An amino acid chain that is canonically produced de novo by ribosome-mediated translation of a genetically-encoded mRNA, and any derivatives thereof.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Protein {

  private String comment;
  private String label;
  private String uniprotId;
  private Integer numberOfAminoAcids;
  private String proteinFunction;
  private String species;
  private String geneName;
  private Integer annotationScore;

}