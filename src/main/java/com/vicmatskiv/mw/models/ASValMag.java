// Date: 6/4/2017 9:00:18 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ASValMag extends ModelBase
{
  //fields
    ModelRenderer Mag1;
    ModelRenderer Mag2;
    ModelRenderer Mag3;
    ModelRenderer Mag4;
  
  public ASValMag()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Mag1 = new ModelRenderer(this, 0, 0);
      Mag1.addBox(0F, 0F, 0F, 4, 18, 5);
      Mag1.setRotationPoint(0.5F, 8.1F, -2.2F);
      Mag1.setTextureSize(64, 32);
      Mag1.mirror = true;
      setRotation(Mag1, 2.862753F, 0F, 0F);
      Mag2 = new ModelRenderer(this, 0, 0);
      Mag2.addBox(0F, 0F, 0F, 3, 18, 2);
      Mag2.setRotationPoint(1F, 7.15F, -6.3F);
      Mag2.setTextureSize(64, 32);
      Mag2.mirror = true;
      setRotation(Mag2, 2.862753F, 0F, 0F);
      Mag3 = new ModelRenderer(this, 0, 0);
      Mag3.addBox(0F, 0F, 0F, 4, 2, 2);
      Mag3.setRotationPoint(0.5F, 7.3F, -6.5F);
      Mag3.setTextureSize(64, 32);
      Mag3.mirror = true;
      setRotation(Mag3, 2.862753F, 0F, 0F);
      Mag4 = new ModelRenderer(this, 0, 0);
      Mag4.addBox(0F, 0F, 0F, 5, 2, 5);
      Mag4.setRotationPoint(0F, 8.55F, -2.3F);
      Mag4.setTextureSize(64, 32);
      Mag4.mirror = true;
      setRotation(Mag4, 2.862753F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Mag1.render(f5);
    Mag2.render(f5);
    Mag3.render(f5);
    Mag4.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}