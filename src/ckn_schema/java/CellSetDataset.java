package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A dataset that is about cells taken from one or more tissue samples.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CellSetDataset {

  private String datasetName;
  private String datasetIdentifier;
  private String species;
  private String version;
  private String datasetCollectionVersion;
  private String publication;
  private String anatomicalStructure;
  private String diseaseStatus;
  private Integer cellCount;
  private String cellType;
  private String cellxgeneCollection;

}