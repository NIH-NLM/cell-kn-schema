package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A region (or regions) that includes all of the sequence elements necessary to encode a functional transcript. A gene may include regulatory regions, transcribed regions and/or other functional sequence regions.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Gene {

  private String geneSymbol;
  private String label;
  private String uniprotId;
  private String species;
  private String geneType;
  private String refseqSummary;
  private String mrna(nm)AndProtein(np)Sequences;
  private String referenceSequenceIdentifier;

}