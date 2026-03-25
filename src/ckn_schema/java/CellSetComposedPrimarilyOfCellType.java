package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a cell set and a cell type that comprises most or all of the set.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CellSetComposedPrimarilyOfCellType extends Association<CellSet, String, CellType> {


}