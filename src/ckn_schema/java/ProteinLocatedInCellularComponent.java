package None;

import java.util.List;
import lombok.*;






/**
  A relationship between a protein and a cellular component that is a constituent part of it.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class ProteinLocatedInCellularComponent extends Association {

  private String source;

}