package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a protein and a cell type that it is part of.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ProteinPartOfCellType extends Association<Protein, String, CellType> {


}