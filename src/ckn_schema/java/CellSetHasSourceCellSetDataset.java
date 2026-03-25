package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a cell set and the dataset that contains data about it.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CellSetHasSourceCellSetDataset extends Association<CellSet, String, CellSetDataset> {


}