package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A cell type marker gene is a gene that is selectively expressed in cells of a given type and can be reliably used alone or in combination as a canonical characteristic to optimally classify them.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class BiomarkerCombination {

  private String markers;
  private Float fBetaScore;

}