package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between two cell sets that are both instances of the same cell type that have been mapped to each other.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CellSetExactMatchCellSet extends Association<CellSet, String, CellSet> {


}