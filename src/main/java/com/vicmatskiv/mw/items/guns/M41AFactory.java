package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M41A;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.WorldHelper;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class M41AFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("M41A")
//		.withAmmo(CommonProxy.AR15Mag)
//		.withAmmoCapacity(30)
		.withFireRate(0.9999999f)
		.withRecoil(1.7f)
		.withZoom(0.9f)
		//.withMaxShots(5)
		.withShootSound("M41A")
		//.withSilencedShootSound("AR15Silenced")
		.withReloadSound("NoBoltReload")
		.withUnloadSound("Unload")
		.withReloadingTime(40)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(1f)
		.withFlashScale(() -> 0.8f)
		.withFlashOffsetX(() -> 0.15f)
		.withFlashOffsetY(() -> 0.2f)
		.withCreativeTab(ModernWarfareMod.FunGunsTab)
		.withCrafting(CraftingComplexity.MEDIUM, 
                CommonProxy.SteelPlate,
                CommonProxy.MetalComponents,
                CommonProxy.MiniSteelPlate,
                CommonProxy.SteelIngot)
		.withInformationProvider(stack -> Arrays.asList("--ALIEN was a good movie--", "", "Type: Pulse rifle", "Damage: 4",
		"Caliber: 10x24mm", "Magazines:", "99rnd 10x24mm Magazine", "Fire Rate: Auto"))
		.withCompatibleAttachment(CommonProxy.Gold, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Gold.getTextureVariantIndex("Gold"));
                }, 
                (a, i) -> {
                }
        )
        .withCompatibleAttachment(CommonProxy.Diamond, 
                (a, i) -> {
                    i.setActiveTextureIndex(CommonProxy.Diamond.getTextureVariantIndex("Diamond"));
                }, 
                (a, i) -> {
                }
        )
		.withCompatibleAttachment(CommonProxy.M41AMag, (model) -> {
		})
		.withTextureNames("M41A", "Electric")
		.withCompatibleAttachment(CommonProxy.Extra, true, (model) -> {
	    	if(model instanceof M4Iron1) {
				GL11.glTranslatef(0.175F, -1.51F, 1.32F);
				GL11.glScaled(0.2F, 0.2F, 0.2F);
			} else if(model instanceof M4Iron2) {
				GL11.glTranslatef(0.255F, -1.55F, -2.4F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof P90iron) {
				GL11.glTranslatef(0.26F, -1.55F, -2.35F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AKMiron1) {
				GL11.glTranslatef(0.125F, -1.8F, -0.5F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AKMiron2) {
				GL11.glTranslatef(0.13F, -1.55F, -3.05F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof AK47iron) {
				GL11.glTranslatef(0.092F, -1.91F, -0.9F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof G36CIron1) {
				GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof G36CIron2) {
				GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof ScarIron1) {
				GL11.glTranslatef(0.165F, -1.65F, 1F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof ScarIron2) {
				GL11.glTranslatef(0.25F, -1.55F, -2F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof FALIron) {
				GL11.glTranslatef(0.155F, -1.49F, -0.6F);
				GL11.glScaled(0.38F, 0.38F, 0.38F);
			} else if(model instanceof M14Iron) {
				GL11.glTranslatef(0.129F, -1.63F, -2.08F);
				GL11.glScaled(0F, 0F, 0F);
			} else if(model instanceof MP5Iron) {
				GL11.glTranslatef(0.215F, -1.54F, 1.2F);
				GL11.glScaled(0F, 0F, 0F);
			}
		})
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new M41A())
			//.withTextureName("M4A1")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
				GL11.glScaled(0.35F, 0.35F, 0.35F);
				GL11.glTranslatef(1, 1f, -0.4f);
				GL11.glRotatef(-120F, -0.5f, 7f, 3f);
			})
			.withThirdPersonPositioning((renderContext) -> {
				GL11.glScaled(0.6F, 0.6F, 0.6F);
				GL11.glTranslatef(-1.8F, 0.3F, 1.5F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioning((renderContext) -> {
				GL11.glTranslatef(0.15F, -0.35F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-0.3F, -0.8F, 0.8F);
				})
				
			.withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glTranslatef(0.15F, -0.35F, -0.2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                GL11.glTranslatef(-0.3F, -0.8F, 1.2F);
                GL11.glRotatef(-4F, 1f, 0f, 0f);
                })
		
			.withFirstPersonCustomPositioning(CommonProxy.M41AMag, (renderContext) -> {
//				GL11.glTranslatef(0.25F, -0.32F, -0.2F);
//				GL11.glRotatef(45F, 0f, 1f, 0f);
//				GL11.glScaled(0.55F, 0.55F, 0.55F);
//				GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				})
				
			.withFirstPersonPositioningReloading(
					
					new Transition((renderContext) -> { // Reload position
						GL11.glTranslatef(0F, -0.8F, -0.7F);
						GL11.glRotatef(45F, 0f, 1f, 0f);
						GL11.glRotatef(-40F, 0f, 0f, 1f);
						GL11.glRotatef(-10F, 1f, 0f, 0f);
						GL11.glScaled(0.55F, 0.55F, 0.55F);
						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
					}, 250, 500),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glTranslatef(0F, -0.8F, -0.7F);
						GL11.glRotatef(45F, 0f, 1f, 0f);
						GL11.glRotatef(-40F, 0f, 0f, 1f);
						GL11.glRotatef(-10F, 1f, 0f, 0f);
						GL11.glScaled(0.55F, 0.55F, 0.55F);
						GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
					}, 250, 20)
			)
			
			.withFirstPersonPositioningUnloading(
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0F, -0.8F, -0.7F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glRotatef(-40F, 0f, 0f, 1f);
					GL11.glRotatef(-10F, 1f, 0f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 150, 50),
				new Transition((renderContext) -> { // Reload position
					GL11.glTranslatef(0F, -0.8F, -0.7F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glRotatef(-40F, 0f, 0f, 1f);
					GL11.glRotatef(-10F, 1f, 0f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 150, 50)
			)
			
			.withFirstPersonCustomPositioningUnloading(CommonProxy.M41AMag,
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0.2F, 0.5F, -0.2F);
//					GL11.glRotatef(-20F, 1f, 0f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
					GL11.glTranslatef(0.05F, 1.5F, 0F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
					
			.withFirstPersonCustomPositioningReloading(CommonProxy.M41AMag,
				new Transition((renderContext) -> {
					GL11.glTranslatef(0.05F, 1.5F, 0F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
					//GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000),
				new Transition((renderContext) -> {
//					GL11.glTranslatef(0.5F, 0F, -0.2F);
//					GL11.glRotatef(0F, 0f, 1f, 0f);
//					GL11.glScaled(0.55F, 0.55F, 0.55F);
//					GL11.glTranslatef(-0.4F, -0.8F, 0.9F);
				}, 250, 1000)
					)
				
			.withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glTranslatef(-0.1F, -0.289F, -0.3F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);

				// Zoom
				GL11.glTranslatef(0.135F, -1.15f, 1.3f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.AKMIron)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0F, 0f, 0f);
				} 
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, 0.08f, 0.7f);
				} 
				
				// Scope Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Scope)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, -0.04f, 5f);
				} 

				// HP Zoomw
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.HP)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0.005F, -0.04f, 5f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.03f, 0.3f);
				} 

				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(0F, 0.04f, 0.6f);
				} 
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Kobra)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(1.373F, -1.32f, 2.8f);
				} 
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                GL11.glTranslatef(-0.1F, -0.289F, -0.3F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);

                // Zoom
                GL11.glTranslatef(0.135F, -1.15f, 1.36f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
                GL11.glRotatef(-0.5F, 1f, 0f, 0f);
                
                // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.AKMIron)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0f, 0f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.005F, 0.08f, 0.7f);
                } 
                
                // Scope Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Scope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.005F, -0.04f, 5f);
                } 

                // HP Zoomw
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.HP)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0.005F, -0.04f, 5f);
                } 
                
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Reflex)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(0F, 0.03f, 0.3f);
                } 

                // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Holo2)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0F, 0.04f, 0.6f);
                } 
                // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), CommonProxy.Kobra)) {
                    //System.out.println("Position me for Reflex");
                    GL11.glTranslatef(1.373F, -1.32f, 2.8f);
                } 
                
                // Everything else
                else {
                    GL11.glTranslatef(1.373F, -1.34f, 2.4f);
                }
                
            
                })
				
				
			.withFirstPersonPositioningRunning((renderContext) -> {
				GL11.glScaled(0.8F, 0.8F, 0.8F);
				GL11.glRotatef(-20F, -4f, 1f, -2f);
				GL11.glTranslatef(0.3F, -0.4F, -1F);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glRotatef(-35F, 2f, 1f, 1f);
				GL11.glTranslatef(1F, -1F, -1.5F);
			 })
			 
			 .withFirstPersonHandPositioning(
					 (renderContext) -> {
						 GL11.glScalef(2f, 2f, 3.3f);
						 GL11.glTranslatef(0.65f, 0f, 0.2f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-50f, 1f, 0f, 0f);
						
					 }, 
					 (renderContext) -> {
						 GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0.2f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					 })
					 
			.withFirstPersonHandPositioningModifying(
					 (renderContext) -> {
						 GL11.glScalef(2.2f, 2.2f, 2.2f);
						 GL11.glTranslatef(1f, 0.4f, 0.1f);
						 GL11.glRotatef(99f, 0, 0f, 1f);
						 GL11.glRotatef(-60f, 20f, 20f, -20f);
					 }, 
					 (renderContext) -> {
						 GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0.2f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					 })
					 
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.4f, 1f, 0.8f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-90f, 1f, 0f, 0f);
						 GL11.glRotatef(20f, 0f, 0f, 1f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.6f, 1f, 0.8f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-85f, 1f, 0f, 0f);
						 GL11.glRotatef(80f, 0f, 0f, 1f);
					}, 50, 200))
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0.2f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0.2f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 50))
					
			.withFirstPersonLeftHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.6f, 1f, 0.8f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-85f, 1f, 0f, 0f);
						 GL11.glRotatef(80f, 0f, 0f, 1f);
					}, 50, 200),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(2f, 2f, 2.5f);
						 GL11.glTranslatef(0.4f, 1f, 0.8f);
						 GL11.glRotatef(60f, 0, 0f, 1f);
						 GL11.glRotatef(-90f, 1f, 0f, 0f);
						 GL11.glRotatef(20f, 0f, 0f, 1f);
					}, 50, 200)
					)
					
			.withFirstPersonRightHandPositioningUnloading(
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0.2f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((renderContext) -> { // Reload position
						GL11.glScalef(1.8f, 1.8f, 2.5f);
						 GL11.glTranslatef(-0.15f, 0.2f, 1f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 50))
					
			.build())
		.withSpawnEntityDamage(4f)
		.withSpawnEntityGravityVelocity(0.0118f)
				
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}