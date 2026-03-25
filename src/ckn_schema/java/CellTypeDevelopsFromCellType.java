package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a cell type and another cell type it directly or indirectly develops from.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CellTypeDevelopsFromCellType extends Association<CellType, String, CellType> {


}