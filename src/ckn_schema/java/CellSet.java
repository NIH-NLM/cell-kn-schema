package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A collection of cells that have some common property.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class CellSet {

  private String authorCellTerm;
  private String assay;
  private CellType ontologyPurl;
  private String anatomicalStructure;
  private String species;
  private String publication;
  private String datasetName;
  private Integer cellCount;
  private String biomarkerCombination;
  private String binaryGeneSet;
  private String expressedGenes;
  private String cellxgeneCollection;
  private String cellxgeneDataset;

}