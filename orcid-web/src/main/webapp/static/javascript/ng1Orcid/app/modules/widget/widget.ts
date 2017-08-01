declare var getBaseUri: any;
declare var logAjaxError: any;

import * as angular from 'angular';
import { NgModule } from '@angular/core';
import { downgradeComponent, UpgradeModule } from '@angular/upgrade/static';

//In the end only widgetNg2 should remain
import { /*widgetCmp, widgetCtrl,*/ WidgetComponent } from './widget.component.ts';

// This is the Angular 1 part of the module
export const WidgetModule = angular.module(
    'WidgetModule', 
    []
);

//WidgetModule.component('widgetCmp', widgetCmp);
//WidgetModule.controller('widgetCtrl', widgetCtrl);

// This is the Angular 2 part of the module
@NgModule(
    {
        
        declarations: [ WidgetComponent ],
        entryComponents: [ WidgetComponent ],
        
    }
)
export class WidgetNg2Module {}

// components migrated to angular 2 should be downgraded here
//Must convert as much as possible of our code to directives

WidgetModule.directive(
    'widgetNg2', 
    <any>downgradeComponent(
        {
            component: WidgetComponent,
            //inputs: ['text']
        }
    )
);
