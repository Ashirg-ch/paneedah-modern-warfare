// Date: 3/18/2017 12:52:59 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class PSO12 extends ModelBase
{
  //fields
    ModelRenderer Scope1;
    ModelRenderer Scope2;
    ModelRenderer Scope3;
    ModelRenderer Scope4;
    ModelRenderer Scope5;
    ModelRenderer Scope6;
    ModelRenderer Scope7;
    ModelRenderer Scope8;
    ModelRenderer Scope9;
    ModelRenderer Scope10;
    ModelRenderer Scope11;
    ModelRenderer Scope12;
  
  public PSO12()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Scope1 = new ModelRenderer(this, 0, 0);
      Scope1.addBox(0F, 0F, 0F, 1, 1, 1);
      Scope1.setRotationPoint(0.5F, -2F, 0F);
      Scope1.setTextureSize(64, 32);
      Scope1.mirror = true;
      setRotation(Scope1, 0F, 0F, 0F);
      Scope2 = new ModelRenderer(this, 0, 0);
      Scope2.addBox(0F, 0F, 0F, 1, 1, 1);
      Scope2.setRotationPoint(0.5F, 3F, 0F);
      Scope2.setTextureSize(64, 32);
      Scope2.mirror = true;
      setRotation(Scope2, 0F, 0F, 0F);
      Scope3 = new ModelRenderer(this, 0, 0);
      Scope3.addBox(0F, 0F, 0F, 1, 1, 1);
      Scope3.setRotationPoint(3F, 0.5F, 0F);
      Scope3.setTextureSize(64, 32);
      Scope3.mirror = true;
      setRotation(Scope3, 0F, 0F, 0F);
      Scope4 = new ModelRenderer(this, 0, 0);
      Scope4.addBox(0F, 0F, 0F, 1, 1, 1);
      Scope4.setRotationPoint(-2F, 0.5F, 0F);
      Scope4.setTextureSize(64, 32);
      Scope4.mirror = true;
      setRotation(Scope4, 0F, 0F, 0F);
      Scope5 = new ModelRenderer(this, 0, 0);
      Scope5.addBox(0F, 0F, 0F, 2, 1, 1);
      Scope5.setRotationPoint(1.5F, -2F, 0F);
      Scope5.setTextureSize(64, 32);
      Scope5.mirror = true;
      setRotation(Scope5, 0F, 0F, 0.5205006F);
      Scope6 = new ModelRenderer(this, 0, 0);
      Scope6.addBox(0F, 0F, 0F, 1, 2, 1);
      Scope6.setRotationPoint(4F, 0.5F, 0F);
      Scope6.setTextureSize(64, 32);
      Scope6.mirror = true;
      setRotation(Scope6, 0F, 0F, 2.639681F);
      Scope7 = new ModelRenderer(this, 0, 0);
      Scope7.addBox(0F, 0F, 0F, 1, 2, 1);
      Scope7.setRotationPoint(0.5F, -2F, 0F);
      Scope7.setTextureSize(64, 32);
      Scope7.mirror = true;
      setRotation(Scope7, 0F, 0F, 1.041001F);
      Scope8 = new ModelRenderer(this, 0, 0);
      Scope8.addBox(0F, 0F, 0F, 2, 1, 1);
      Scope8.setRotationPoint(-2F, 0.5F, 0F);
      Scope8.setTextureSize(64, 32);
      Scope8.mirror = true;
      setRotation(Scope8, 0F, 0F, -1.041001F);
      Scope9 = new ModelRenderer(this, 0, 0);
      Scope9.addBox(0F, 0F, 0F, 1, 2, 1);
      Scope9.setRotationPoint(1.5F, 4F, 0F);
      Scope9.setTextureSize(64, 32);
      Scope9.mirror = true;
      setRotation(Scope9, 0F, 0F, -2.156359F);
      Scope10 = new ModelRenderer(this, 0, 0);
      Scope10.addBox(0F, 0F, 0F, 2, 1, 1);
      Scope10.setRotationPoint(4F, 1.5F, 0F);
      Scope10.setTextureSize(64, 32);
      Scope10.mirror = true;
      setRotation(Scope10, 0F, 0F, 2.156359F);
      Scope11 = new ModelRenderer(this, 0, 0);
      Scope11.addBox(0F, 0F, 0F, 1, 2, 1);
      Scope11.setRotationPoint(-2F, 1.5F, 0F);
      Scope11.setTextureSize(64, 32);
      Scope11.mirror = true;
      setRotation(Scope11, 0F, 0F, -0.5948578F);
      Scope12 = new ModelRenderer(this, 0, 0);
      Scope12.addBox(0F, 0F, 0F, 2, 1, 1);
      Scope12.setRotationPoint(0.5F, 4F, 0F);
      Scope12.setTextureSize(64, 32);
      Scope12.mirror = true;
      setRotation(Scope12, 0F, 0F, -2.565324F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Scope1.render(f5);
    Scope2.render(f5);
    Scope3.render(f5);
    Scope4.render(f5);
    Scope5.render(f5);
    Scope6.render(f5);
    Scope7.render(f5);
    Scope8.render(f5);
    Scope9.render(f5);
    Scope10.render(f5);
    Scope11.render(f5);
    Scope12.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
