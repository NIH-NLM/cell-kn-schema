package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a cell type whose instances are also instances of another cell type.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CellTypeSubclassOfCellType extends Association<CellType, String, CellType> {


}