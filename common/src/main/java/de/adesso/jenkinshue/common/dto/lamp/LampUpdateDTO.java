package de.adesso.jenkinshue.common.dto.lamp;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import de.adesso.jenkinshue.common.dto.job.JobDTO;
import de.adesso.jenkinshue.common.dto.scenario_config.ScenarioConfigDTO;
import de.adesso.jenkinshue.common.enumeration.Scenario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author wennier
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LampUpdateDTO implements Serializable {
	
	private static final long serialVersionUID = -4851338323894376390L;
	
	private long id;

	private String hueUniqueId;

	private String name;

	private Date workingStart;

	private Date workingEnd;
	
	private List<JobDTO> jobs;
	
	private Scenario lastShownScenario;
	
	private List<ScenarioConfigDTO> buildingConfigs;
	
	private List<ScenarioConfigDTO> failureConfigs;
	
	private List<ScenarioConfigDTO> unstableConfigs;
	
	private List<ScenarioConfigDTO> successConfigs;
	
	private long teamId;

}