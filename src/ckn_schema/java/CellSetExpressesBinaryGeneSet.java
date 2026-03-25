package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a cell set and a set of binary genes that it expresses.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CellSetExpressesBinaryGeneSet extends Association<CellSet, String, BinaryGeneSet> {


}