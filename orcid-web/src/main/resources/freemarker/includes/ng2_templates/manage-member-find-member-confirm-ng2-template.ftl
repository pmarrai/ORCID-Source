<script type="text/ng-template" id="manage-member-find-member-confirm-ng2-template">
	<div class="lightbox-container" *ngIf="object">
		<div class="row">
			<div class="col-md-12 col-xs-12 col-sm-12">
				<h3><@orcid.msg 'manage_member.edit_member.confirm_update.title' /></h3>	
				<p><@orcid.msg 'manage_member.edit_memeber.confirm_update.text' /></p>			
				<p *ngIf="object.groupName"><strong>{{object.groupName.value}}</strong></p>	
				<p *ngIf="object.displayName"><strong>{{object.displayName.value}}</strong></p>	
				<p *ngIf="object.name"><strong>{{object.name.value}}</strong></p>										
    			<div class="btn btn-danger" (click)="update()">
    				<@orcid.msg 'manage_member.edit_member.btn.update' />
    			</div>
    			<a href="" (click)="cancel()"><@orcid.msg 'freemarker.btncancel' /></a>
			</div>
		</div>
    </div>
</script>