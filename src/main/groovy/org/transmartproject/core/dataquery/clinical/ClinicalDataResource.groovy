package org.transmartproject.core.dataquery.clinical

import org.transmartproject.core.dataquery.Patient
import org.transmartproject.core.dataquery.TabularResult
import org.transmartproject.core.doc.Experimental
import org.transmartproject.core.exceptions.InvalidArgumentsException
import org.transmartproject.core.ontology.OntologyTerm
import org.transmartproject.core.ontology.Study
import org.transmartproject.core.querytool.QueryResult

@Experimental
public interface ClinicalDataResource {

    @Experimental
    TabularResult<ClinicalVariableColumn, PatientRow> retrieveData(QueryResult patientSet,
                                                                   List<ClinicalVariable> variables)

    @Experimental
    TabularResult<ClinicalVariableColumn, PatientRow> retrieveData(List<QueryResult> patientSets,
                                                                   List<ClinicalVariable> variables)

    @Experimental
    TabularResult<ClinicalVariableColumn, PatientRow> retrieveData(Study study, List<Patient> patients, List<OntologyTerm> ontologyTerms)

    @Experimental
    ClinicalVariable createClinicalVariable(Map<String, Object> parameters,
                                            String type) throws InvalidArgumentsException

}
