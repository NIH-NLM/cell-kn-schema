package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a cell set and an anatomical structure it was extracted from for analysis.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CellSetDerivesFromAnatomicalStructure extends Association<CellSet, String, AnatomicalStructure> {


}