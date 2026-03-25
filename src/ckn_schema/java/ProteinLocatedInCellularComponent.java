package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a protein and a cellular component that is a constituent part of it.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ProteinLocatedInCellularComponent extends Association<Protein, String, CellularComponent> {

  private String source;

}