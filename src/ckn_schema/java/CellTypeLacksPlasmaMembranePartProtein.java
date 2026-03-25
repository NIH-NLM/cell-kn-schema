package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a cell type and a protein that is not part of its plasma membrane but is part of the plasma membrane of related cell types.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CellTypeLacksPlasmaMembranePartProtein extends Association<CellType, String, Protein> {


}