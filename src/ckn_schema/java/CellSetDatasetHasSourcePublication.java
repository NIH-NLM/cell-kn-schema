package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a cell set dataset and the publication that can be used as a reference for it.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CellSetDatasetHasSourcePublication extends Association<CellSetDataset, String, Publication> {


}