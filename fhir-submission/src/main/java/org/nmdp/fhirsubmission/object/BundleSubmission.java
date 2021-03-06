package org.nmdp.fhirsubmission.object;

/**
 * Created by Andrew S. Brown, Ph.D., <andrew@nmdp.org>, on 10/11/17.
 * <p>
 * fhir-submission
 * Copyright (c) 2012-2017 National Marrow Donor Program (NMDP)
 * <p>
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation; either version 3 of the License, or (at
 * your option) any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; with out even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
 * License for more details.
 * <p>
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library;  if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307  USA.
 * <p>
 * > http://www.fsf.org/licensing/licenses/lgpl.html
 * > http://www.opensource.org/licenses/lgpl-license.php
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class BundleSubmission {
    private String patient;
    private Map<String, String> specimens;
    private Map<String, String> diangosticReports;
    private Map<String, List<String>> observations;
    private Map<String, List<String>> sequences;
    private Map<String, List<String>> procedureRequests;
    private Map<String, String> devices;
    private Map<String, String> provenances;

    public BundleSubmission() {
        this.specimens = new HashMap<>();
        this.diangosticReports = new HashMap<>();
        this.observations = new HashMap<>();
        this.sequences = new HashMap<>();
        this.procedureRequests = new HashMap<>();
        this.devices = new HashMap<>();
        this.provenances = new HashMap<>();
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public Map<String, String> getSpecimens() {
        return specimens;
    }

    public void setSpecimens(Map<String, String> specimens) {
        this.specimens = specimens;
    }

    public void addSpecimen(String key, String value) {
        this.specimens.put(key, value);
    }

    public Map<String, String> getDiangosticReports() {
        return diangosticReports;
    }

    public void setDiangosticReports(Map<String, String> diangosticReports) {
        this.diangosticReports = diangosticReports;
    }

    public void addDiagnosticReport(String key, String value) {
        this.diangosticReports.put(key, value);
    }

    public Map<String, List<String>> getObservations() {
        return observations;
    }

    public void setObservations(Map<String, List<String>> observations) {
        this.observations = observations;
    }

    public void addObservation(String key, String value) {
        this.observations.computeIfAbsent(key, (v) -> new ArrayList<>());
        List<String> values = this.observations.get(key);
        values.add(value);
        this.observations.put(key, values);
    }

    public Map<String, List<String>> getSequences() {
        return sequences;
    }

    public void setSequences(Map<String, List<String>> sequences) {
        this.sequences = sequences;
    }

    public void addSequence(String key, String value) {
        this.sequences.computeIfAbsent(key, (v) -> new ArrayList<>());
        List<String> values = this.sequences.get(key);
        values.add(value);
        this.sequences.put(key, values);
    }

    public Map<String, List<String>> getProcedureRequests() {
        return procedureRequests;
    }

    public void setProcedureRequests(Map<String, List<String>> procedureRequests) {
        this.procedureRequests = procedureRequests;
    }

    public void addProcedureRequest(String key, String value) {
        List<String> values = this.sequences.get(key);
        values.add(value);
        this.procedureRequests.put(key, values);
    }

    public Map<String, String> getDevices() {
        return devices;
    }

    public void setDevices(Map<String, String> devices) {
        this.devices = devices;
    }

    public Map<String, String> getProvenances() {
        return provenances;
    }

    public void setProvenances(Map<String, String> provenances) {
        this.provenances = provenances;
    }
}
