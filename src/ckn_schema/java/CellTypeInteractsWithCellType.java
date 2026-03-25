package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between two cell types that are causally connected.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CellTypeInteractsWithCellType extends Association<CellType, String, CellType> {


}