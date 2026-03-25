package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a cell set and a biomarker combination that can be used to uniquely identify it.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CellSetHasCharacterizingMarkerSetBiomarkerCombination extends Association<CellSet, String, BiomarkerCombination> {


}