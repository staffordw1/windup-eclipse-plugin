/*******************************************************************************
 * Copyright (c) 2016 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.windup.model.domain;

/**
 * Common constants used to share data throughout the Windup tooling.
 */
public interface WindupConstants {

	/**
	 * Windup launch type ID.
	 */
	String LAUNCH_TYPE = "org.jboss.tools.windup.ui.WindupLaunchConfigurationType";
	
	/**
	 * Projects launch configuration attribute.
	 */
	String DEFAULT = "";
	
	/**
	 * Launch Events
	 */
	String LAUNCH_COMPLETED = "windup/launch/completed";
	
	/**
	 * Windup completed
	 */
	String WINDUP_RUN_COMPLETED = "windup/run/completed";
	
	/**
	 * UI Events
	 */
	String ACTIVE_CONFIG = "windup/config/selected";
	String SYNCH = "windup/config/synch";
	String MARKERS_ATTACHED = "windup/issue/markers";
	
	/**
	 * Model Events
	 */
	String CONFIG_DELETED = "windup/model/config/deleted";
	String CONFIG_CREATED = "windup/model/config/created";
}
