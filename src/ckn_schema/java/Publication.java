package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A document that is the output of a publishing process.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Publication {

  private String year;
  private String title;
  private String authorList;
  private String pmcid;
  private String pmid;
  private String publicationDoiIdentifier;
  private String journal;

}