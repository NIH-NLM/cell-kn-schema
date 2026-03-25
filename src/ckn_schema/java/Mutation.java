package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A sequence_alteration is a sequence_feature whose extent is the deviation from another sequence.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class Mutation {

  private String referenceSequenceIdentifier;

}