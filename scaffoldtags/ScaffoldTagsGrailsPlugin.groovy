/* Copyright 2007 Daiji Takamori
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

 /**
  * This provides a new set of scaffolding templates as well as a 
  * supporting tags that simply creating and modifying views through
  * additional coding conventions, even as domain classes are modified.
  *
  * The tag library makes it possible to apply inheritance, reuse,
  * and dynamic generation to how views of domain objects are generated.
  *
  * @author Daiji Takamori
  * @since March 25, 2007
  */
class ScaffoldTagsGrailsPlugin {
	def version = "0.7.2"
	def dependsOn = [:]
    def author="Daiji Takamori"
    def authorEmail="dt_02138@yahoo.com"
    def title="Adds tags to support fully-customizable & dynamic scaffolding"
    def description="""
This provides a new set of scaffolding templates as well as a 
supporting tags that simply creating and modifying views through
additional coding conventions, even as domain classes are modified.

The tag library makes it possible to apply inheritance, reuse,
and dynamic generation to how views of domain objects are generated.
Skin support makes it possible to transition between multiple views 
of the application.
"""
	def documentation="http://grails.org/ScaffoldTags+Plugin"
	
	def doWithSpring = {
	}   
	def doWithApplicationContext = { applicationContext ->
	}
	def doWithWebDescriptor = {
	}	                                      
	def onChange = { event ->
	}                                                                                  
	def onApplicationChange = { event ->
	}
}
