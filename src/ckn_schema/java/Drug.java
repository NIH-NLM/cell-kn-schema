package None;

import java.util.List;
import lombok.*;






/**
  A drug product that is bearer of a clinical drug role.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Drug  {

  private String name;
  private String disease;
  private String study;
  private String uniprotId;
  private String proteinTarget;
  private String mechanismOfAction;
  private String tradeNames;
  private String exactSynonym;
  private String approvalStatus;

}